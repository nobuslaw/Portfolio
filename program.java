public static void main(String[] args){
    callMyself(6);
    System.exit(0);
}

public static void callMyself(int i){
    if(i<0){
        return;
    }
    System.out.print(i);
    i = i - 1;
    callMyself(i);
}