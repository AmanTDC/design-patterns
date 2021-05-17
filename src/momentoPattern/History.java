package momentoPattern;

import momentoPattern.EditorState;

import java.util.ArrayList;
import java.util.Stack;

public class History {
    Stack<EditorState> stack = new Stack<>();
    void update(EditorState es){
        stack.push(es);
    }
    EditorState retrieve() {
        if(!stack.empty()){

            return  stack.pop();
        }
        else return (new EditorState("","",14));
    }

}
