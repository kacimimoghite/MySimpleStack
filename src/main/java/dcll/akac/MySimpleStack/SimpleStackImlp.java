package dcll.akac.MySimpleStack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by moghit on 24/02/2016.
 */
public class SimpleStackImlp implements SimpleStack {

    Stack <Object> wrappedStack = new Stack<Object>();
    public boolean isEmpty(){
        return wrappedStack.isEmpty();
    }

    public int getSize(){
        return wrappedStack.size();
    }

    public void push(Item item){
        wrappedStack.push(item);
    }

    public Item peek() throws EmptyStackException{

        return (Item) wrappedStack.peek();
    }

    public Item pop() throws EmptyStackException{
        return (Item) wrappedStack.pop();
    }
}
