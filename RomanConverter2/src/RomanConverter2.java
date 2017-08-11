public class RomanConverter2 {
    private String[]romanNumber = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M","MMXVII"};
    private int[]romanValues = {1,4,5,9,10,40,50,90,100,400,500,900,1000,2017};

    public String convert(int number) {
        String result = "";
        int romanIndex = romanNumber.length - 1;
        while (number > 0) {
            while (romanValues[romanIndex] <= number){
                result += romanNumber[romanIndex];
                number -= romanValues[romanIndex];
            }
            romanIndex--;
        }
        return result;

//           if(number>=10){
//            for(;number >= 10;){
//                result += "X";
//                number -= 10;
//            }
//        }
//        if(number==9)return result += "IX";
//        if(number==4)return result += "IV";
//        if(number>=5){
//            result += "V";
//            number -= 5;
//        }
//        for (int i = 0; i < number; i++) {
//            result += "I";
//        }
//        return result;
    }
}
