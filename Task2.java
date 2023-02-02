package HomeWork.Task2;
// Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
// Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга 
// (вхождение в обратном порядке).
// *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
// Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 | 3 – 56 = -53 | 3 * 56 = 168 
// Используем метод StringBuilder.append().
// Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().



public class Task2{
static String str1 = "dsds"; 
static String str2 = "dsds";
static int i1 = 3;
static int i2 = 56;
static int i3 = i1 * i2;
    public static void main(String[] args) {
        contains("dsds" , "dsds");
        contains(str1, new StringBuilder(str2).reverse().toString());
        System.out.println(stringSum(i1, i2));
        System.out.println(stringDif(i1, i2));
        stringMult(i1, i2, i3);
        replase1(stringSum(i1, i2));
        replase2(stringDif(i1, i2));
    }
    public static void contains(String str1 , String str2){
        System.out.println( str1.contains(str2));

    }
    public static  String stringSum( int i1, int i2){
        // Double begin = (double) System.currentTimeMillis();
        StringBuilder strofnumber = new StringBuilder("");
        strofnumber.append(String.valueOf(i1));
        strofnumber.append(" + ");
        strofnumber.append(String.valueOf(i2));
        strofnumber.append(" = ");
        strofnumber.append(String.valueOf(i1+i2));
        return strofnumber.toString();
        // System.out.println(System.currentTimeMillis()- begin);
    }
    public static String stringDif(int i1 , int i2) {
        // Double begin = (double) System.currentTimeMillis();
        String dif = null;
        dif = i1 + " - " + i2 + " = " + String.valueOf(i1-i2);
        // System.out.println(dif); 
        return dif;
        // System.out.println(System.currentTimeMillis()- begin);
   
    }
    private static void stringMult (int i1, int i2 ,int i3) {
        String mult = "";
        mult = i1 + " * " + i2 + " = " + i3;
        System.out.println(mult);
    }
    private static void replase1(String stringSum) {
        int i = -1;
        i = stringSum.lastIndexOf("=");
        System.out.println(i);
        StringBuilder sb = new StringBuilder(stringSum);
        sb.insert(i, "равно");
        sb.deleteCharAt(i+5);
        System.out.println(sb);    
    }
    public static void replase2(String stringDif){
        StringBuilder sb1 = new StringBuilder(stringDif);
        sb1.replace(7, 7, "равно");
        System.out.println(sb1);

    }
}