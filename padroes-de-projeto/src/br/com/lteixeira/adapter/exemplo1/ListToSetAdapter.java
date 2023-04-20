package br.com.lteixeira.adapter.exemplo1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListToSetAdapter<T> implements Set<T> {

    private List<T> lista;

    public ListToSetAdapter(List<T> lista) {
        this.lista = lista;
    }

    @Override
    public int size() {
        return new HashSet<>(lista).size();
    }

    @Override
    public boolean isEmpty() {
        return new HashSet<>(lista).isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return new HashSet<>(lista).contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return new HashSet<>(lista).iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        return new HashSet<>(lista).add(t);
    }

    @Override
    public boolean remove(Object o) {
        return new HashSet<>(lista).remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return new HashSet<>(lista).containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return new HashSet<>(lista).addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return new HashSet<>(lista).retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return new HashSet<>(lista).removeAll(c);
    }

    @Override
    public void clear() {
        new HashSet<>(lista).clear();
    }
}
