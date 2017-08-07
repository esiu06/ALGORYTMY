package Algorytmy.Struktury;


public class mList {
    Element _head; // "_" nikt nie ma do tego dostepu
    Element _tail;
    int counter;

    public void goThroughListForward(mList list) { //do przodu
        Element p = list._head;
        while (p.next != null) {
            //wykonujemy jakąś logikę
            p = p.next;
            //konczy działanie
        }
    }

    public void goThroughListBackwards(mList list) {//do tyłu
        Element p = list._head;
        while (p.prev != null) {
            p = p.prev;
        }
    }

    public void addElementAtBeginning(int newElement, mList list) {
        Element p = new Element();
        p.data = newElement;
        p.prev = null;
        p.next = list._head;
        list._head = p;
        list.counter++;

        if (p.next != null) {
            p.next.prev = p;
        } else {
            list._tail = p;
        }
    }

    public void addElementAtEnd(int newElement, mList list) {
        Element p = new Element();
        p.data = newElement;
        p.next = null;
        p.prev = _tail;
        list._tail = p;
        list.counter++;

        if (p.prev != null) {
            p.prev.next = p;
        } else {
            list._head = p;
        }
    }

    public Element getElementForward(int data, mList list) {
        Element p = list._head;
        while (p.next != null) {
            if (p.data == data) {
                break;
            }
            p = p.next;
        }
        return p;
    }

    public void printAllElement(mList list) {
        Element p = list._head;
        while (p.next != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }
    public void addelementBeforeElement(int elementToAdd, int elementBefore,mList list){
        Element before = list.getElementForward(elementBefore,list);
        if(before==list._head){
            list.addElementAtBeginning(elementToAdd,list);
        }
        else{
            Element p = new Element();
            p.data = elementToAdd;
            p.prev = before.prev;
            p.next = before;
            Element prevBefore = before.prev;
            prevBefore.next = p;

            before.prev = p;
            list.counter++;
        }
    }
    public void addElementNextAfter(int elementToAdd, int elementAfter, mList list){

        Element after = list.getElementForward(elementAfter,list);
        if(after==list._tail){
            list.addElementAtEnd(elementToAdd,list);
        }
        else{
            Element p = new Element();
            p.data = elementToAdd;
            p.next = after.next;
            p.prev = after;
            Element afternext = after.next;
            afternext.prev= p;
            after.next = p;
            list.counter++;
        }
    }

    public void deleteElement(int elementToDelete, mList list){
        Element toDelete = list.getElementForward(elementToDelete, list);
        counter--;
        if(toDelete.prev == null) {
            list._head = toDelete.next;
            toDelete.next.prev=null;
        }
        else{
            toDelete.next.prev=toDelete.prev;
        }

        if(toDelete.next == null){
            list._tail = toDelete.prev;
            toDelete.prev.next = null;
        }
        else{
            toDelete.prev.next = toDelete.next;
        }
        toDelete=null;
    }
}


