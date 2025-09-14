import java.util.Stack;

public class CareTackerClass {
    Stack<MementoClass> s=new Stack<>();

    public void addMemento(MementoClass m){
        s.push(m);
    }
    public MementoClass undo(){
        if(!s.isEmpty()){
            s.pop();
            return s.pop();
        }
        return null;
    }
}
