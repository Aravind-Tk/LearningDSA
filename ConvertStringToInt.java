class ConvertStringToIntAndViceVerza{
    public static void main(String[] args){

        String text = "123";

        //convert from string to integer
        int num = Integer.parseInt(text);
        System.out.println("Converted to integer - " + num);

        //convert from integer to string
        String converted = String.valueOf(num);
        System.out.println("Converted to string - " + converted);

        String convertSimple = ""+num;
        System.out.println("Converted to string just by concatenating - " +convertSimple);
    }



}