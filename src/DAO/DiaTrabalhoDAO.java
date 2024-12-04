package dao;

import model.DiaTrabalho;
import model.Pedido;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DiaTrabalhoDAO {
    private final List<DiaTrabalho> diasTrabalho = new ArrayList<>();  
    private int currentId = 1;

    public DiaTrabalho create(LocalDate data) {
        DiaTrabalho diaDeTrabalho = new DiaTrabalho(data);
        diaDeTrabalho.setId(currentId++);
        diasTrabalho.add(diaDeTrabalho);
        return diaDeTrabalho;
    }

    public List<DiaTrabalho> findAll() {
        return new ArrayList<>(diasTrabalho);
    }

    public Optional<DiaTrabalho> findById(int id) {
        return diasTrabalho.stream().filter(d -> d.getId() == id).findFirst();
    }

    public DiaTrabalho update(int id, LocalDate data) {
        Optional<DiaTrabalho> diaDeTrabalhoOptional = findById(id);
        if (diaDeTrabalhoOptional.isPresent()) {
            DiaTrabalho diaDeTrabalho = diaDeTrabalhoOptional.get();
            diaDeTrabalho.setData(data);  // Atualizando a data
            return diaDeTrabalho;
        }
        return null;
    }

    public boolean delete(int id) {
        return diasTrabalho.removeIf(d -> d.getId() == id);
    }

    public void addPedido(int diaId, Pedido pedido) {
        Optional<DiaTrabalho> diaDeTrabalhoOptional = findById(diaId);
        diaDeTrabalhoOptional.ifPresent(d -> d.addPedido(pedido));
    }
}
