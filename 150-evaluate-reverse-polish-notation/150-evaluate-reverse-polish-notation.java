class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> num=new Stack<>();
        for(String s:tokens)
        {
            if(s.equals("+") || s.equals("-") || s.equals("*") ||s.equals("/"))
            {
                int num1=num.peek();
                num.pop();
                int num2=num.peek();
                num.pop();
                int res=0;
                switch(s){
                case("+"): res=num2+num1; break;
                case("-"): res=num2-num1; break;
                case("*"): res=num2*num1; break;
                case("/"): res=num2/num1; break;
                }
            num.push(res);
            }
            else
            {
                 
                int number=0;
                number=Integer.valueOf(s);
                num.push(number);
            } 
            // System.out.println(num);
        }
                
        return num.peek();
    }
}