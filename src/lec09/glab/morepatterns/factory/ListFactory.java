package lec09.glab.morepatterns.factory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListFactory {
    public enum Type {ARRAY, LINKED}

    public static List createList(Type type) {
        switch (type){
            case ARRAY:
                return new ArrayList();
            case LINKED:
                return new LinkedList();
            default:
                return new ArrayList();
        }
    }
}
