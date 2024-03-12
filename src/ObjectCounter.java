class ObjectCounter {
    static int count = 0;
    ObjectCounter() {
        count++;
    }
     static int getObjectCount() {
        return count;
    }

    public static void main(String[] args) {

        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();
        ObjectCounter obj4 = new ObjectCounter();

        System.out.println("Number of objects created: " + getObjectCount());
    }
}
