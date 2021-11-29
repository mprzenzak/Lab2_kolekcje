package com.mprzenzak;

import java.util.*;

public class Car implements Comparable<Car>{
    private String ownerFirstName;
    private String ownerLastName;
    private int enginePower;
    private int mileage;

    private static HashSet hashSet = new HashSet();
    private static TreeSet treeSet = new TreeSet();
    private static ArrayList arrayList = new ArrayList();
    private static LinkedList linkedList = new LinkedList();
    private static HashMap hashMap = new HashMap();
    private static TreeMap treeMap = new TreeMap();

    public Car(String ownerFirstName, String ownerLastName, int enginePower, int mileage) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.enginePower = enginePower;
        this.mileage = mileage;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public HashSet getHashSet() {
        return hashSet;
    }

    public void setHashSet(HashSet hashSet) {
        this.hashSet = hashSet;
    }

    public TreeSet getTreeSet() {
        return treeSet;
    }

    public void setTreeSet(TreeSet treeSet) {
        this.treeSet = treeSet;
    }

    public ArrayList getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public LinkedList getLinkedList() {
        return linkedList;
    }

    public void setLinkedList(LinkedList linkedList) {
        this.linkedList = linkedList;
    }

    public HashMap getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap hashMap) {
        this.hashMap = hashMap;
    }

    public TreeMap getTreeMap() {
        return treeMap;
    }

    public void setTreeMap(TreeMap treeMap) {
        this.treeMap = treeMap;
    }

    @Override
    public int compareTo(Car car) {
        if(this.mileage == car.mileage){
            return 0;
        }
        return 1;
    }
}
