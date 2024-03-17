class demo {
    int a = 10;
    String name = "shivam";

    void show() {
        System.out.println(a + " " + name);
    }
}

class test {
    public static void main(String[] args) {
        demo R = new demo();
        R.show();
    }
}