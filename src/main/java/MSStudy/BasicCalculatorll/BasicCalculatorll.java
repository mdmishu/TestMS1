package MSStudy.BasicCalculatorll;

public class BasicCalculatorll {

    public int calculate(String s) {
        int tail = 0;
        char operator = '+';
        int res = 0;
        char[] chrs = s.toCharArray();
        int num =0;
        int n = chrs.length;

        for(int i=0; i<chrs.length; i++){
            char c = chrs[i];
            if(c == ' ') continue;
            if(Character.isDigit(c)){
                num = (int)(c -'0');
                while(i+1 < n && Character.isDigit(chrs[i+1])){
                    num = num * 10 + (int)(chrs[i+1] -'0');
                    i++;
                }

                switch (operator){
                    case '+':
                        res +=tail;
                        tail = num;
                        break;
                    case '-':
                        res += tail;
                        tail = -num;
                        break;
                    case '*':
                         tail *=num;
                         break;
                    case '/':
                        tail /=num;
                        break;
                }
            }else{
                operator = c;
            }
        }
        return  res+tail;
    }

}
