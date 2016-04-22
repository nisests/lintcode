class Solution {
public:
    /**
     * @param n n pairs
     * @return All combinations of well-formed parentheses
     */
    vector<string> generateParenthesis(int n) {
        // Write your code here
        string a,b,s;
        for(int i=0;i<n;i++){
            a.push_back('(');
            b.push_back(')');
        }
        s = a+b;
        save_str.push_back(s);

        recursion(s);
        return save_str;
    }
    vector<string> save_str;
    
    bool is_bracket(string s){
        string st;
        for(auto tmp:s){
            if(tmp=='('){
                st.push_back(tmp);
            }
            if(tmp==')'){
                if(st.empty()){
                    return false;
                }
                st.pop_back();
            }
        }
        if(st.empty()){
            return true;
        }
        return false;
    }
    
    void recursion(string s){
        int n;
        for(int i=0;i<s.size();i++){
            if(s[i]==')'){
                n = i-1;
                break;
            }
        }

        for(int i=n;i<s.size()-1;i++){
            if(s[i+1]=='('){
                return;
            }
            string s_tmp = s;
            // swap
            char c = s_tmp[n];
            s_tmp[n] = s_tmp[i+1];
            s_tmp[i+1] = c;

            if(is_bracket(s_tmp)){
                recursion(s_tmp);
                // save
                save_str.push_back(s_tmp);
            }
        }
    }
    
    
};