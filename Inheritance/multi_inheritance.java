package Inheritance;

class multi_inheritance {
    int a, b, c;
    float d;

    void add() {
        a = 10;
        b = 20;
        c = a + b;
        System.out.println("Addition of two no : " + c);
    }

    void sub() {
        a = 20;
        b = 10;
        c = a - b;
        System.out.println("Subtarction of two no : " + c);
    }
}

class sub1 extends multi_inheritance {
    void multi() {
        a = 4;
        b = 12;
        c = a * b;
        System.out.println("Multiplication of two no is : " + c);
    }

    void devision() {
        a = 20;
        b = 5;
        c = a / b;
        System.out.println("Devision of two no is : " + c);
    }
}

class sub2 extends sub1 {
    void reminder() {
        a = 40;
        b = 7;
        d = a % b;
        System.out.println("Reminder of two no is : " + d);
    }
}

class result extends sub2 {
    public static void main(String[] args) {
        sub2 r = new sub2();
        r.add();
        r.sub();
        r.multi();
        r.devision();
        r.reminder();
    }
}