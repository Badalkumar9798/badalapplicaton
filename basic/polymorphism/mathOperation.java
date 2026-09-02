class mathOperation {

    int add(int a , int b){
        return a+b;
    }

    int add(int a ,int b,int c){
        return a+b+c;
    }

    double add (double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        mathOperation obj = new mathOperation();

        System.out.println(obj.add(45 , 45));
        System.out.println(obj.add(10,20,30));
        System.out.println(obj.add(15.5,14.5));
    }
}