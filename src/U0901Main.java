public class U0901Main {
    public static void main(String[] args) {
        Integer intArr[]={10,20,15};
        Float floatArr[] = new Float[5];
        String stringArr[] = {"fff", "ff"};

        for ( int i = 0; i<floatArr.length; i++){
            floatArr[i] = (float)Math.random();
        }

        U0901WorkArray insWorkArrayInt = new U0901WorkArray(intArr);
        U0901WorkArray insWorkArrayFloat = new U0901WorkArray(floatArr);
        //U0901WorkArray insWorkArrayString = new U0901WorkArray(stringArr);
        System.out.println(insWorkArrayFloat.sum() + " " + insWorkArrayInt.sum());
    }
}
