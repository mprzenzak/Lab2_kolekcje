package com.mprzenzak;

import java.util.*;

public class Tractor extends Car{
    private String ownerFirstName;
    private String ownerLastName;
    private int enginePower;
    private int mileage;

    private static HashSet hashSet = new HashSet();
    private static TreeSet treeSet = new TreeSet();
    private static ArrayList arrayList = new ArrayList();
    private static LinkedList linkedList = new LinkedList();
    private static HashMap hashMap = new HashMap();

    @Override
    public HashSet getHashSet() {
        return hashSet;
    }

    @Override
    public void setHashSet(HashSet hashSet) {
        Tractor.hashSet = hashSet;
    }

    @Override
    public TreeSet getTreeSet() {
        return treeSet;
    }

    @Override
    public void setTreeSet(TreeSet treeSet) {
        Tractor.treeSet = treeSet;
    }

    @Override
    public ArrayList getArrayList() {
        return arrayList;
    }

    @Override
    public void setArrayList(ArrayList arrayList) {
        Tractor.arrayList = arrayList;
    }

    @Override
    public LinkedList getLinkedList() {
        return linkedList;
    }

    @Override
    public void setLinkedList(LinkedList linkedList) {
        Tractor.linkedList = linkedList;
    }

    @Override
    public HashMap getHashMap() {
        return hashMap;
    }

    @Override
    public void setHashMap(HashMap hashMap) {
        Tractor.hashMap = hashMap;
    }

    @Override
    public TreeMap getTreeMap() {
        return treeMap;
    }

    @Override
    public void setTreeMap(TreeMap treeMap) {
        Tractor.treeMap = treeMap;
    }

    private static TreeMap treeMap = new TreeMap();

    public Tractor(String ownerFirstName, String ownerLastName, int enginePower, int mileage) {
        super(ownerFirstName, ownerLastName, enginePower, mileage);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tractor tractor = (Tractor) o;

        if (getEnginePower() != tractor.getEnginePower()) return false;
        if (getMileage() != tractor.getMileage()) return false;
        if (getOwnerFirstName() != null ? !getOwnerFirstName().equals(tractor.getOwnerFirstName()) : tractor.getOwnerFirstName() != null)
            return false;
        return getOwnerLastName() != null ? getOwnerLastName().equals(tractor.getOwnerLastName()) : tractor.getOwnerLastName() == null;
    }

    @Override
    public int hashCode() {
        int result = getOwnerFirstName() != null ? getOwnerFirstName().hashCode() : 0;
        result = 31 * result + (getOwnerLastName() != null ? getOwnerLastName().hashCode() : 0);
        result = 31 * result + getEnginePower();
        result = 31 * result + getMileage();
        return result;
    }
}
