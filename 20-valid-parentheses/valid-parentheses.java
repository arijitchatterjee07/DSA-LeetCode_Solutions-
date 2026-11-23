class Solution {
    public boolean isValid(String s) {
        Stack <Character> st=new Stack<>();
      for (int i=0;i<s.length();i++)
      {
        char ch=s.charAt(i);
        if (st.size() == 0 || ch == '(' || ch == '{' || ch == '[')
        {
          st.push(ch);
        }
        else
        {
          char top=st.peek();
          if ((top == '(' && ch == ')') || (top == '{' && ch == '}') || (top == '[' && ch == ']'))
          {
            st.pop();
          }
          else
          {
            return false;
          }
        }
      }
      if (st.size() > 0)
      {
        return false;
      }
      else
      {
        return true;
      }
    }
}