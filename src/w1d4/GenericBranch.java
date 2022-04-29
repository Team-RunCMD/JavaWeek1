package w1d4;

public class GenericBranch<T extends Comparable<T>> implements Comparable<GenericBranch>{
    private GenericBranch leftBranch;
    private GenericBranch rightBranch;
    private T data;
    /*private T key,
    private K data
     */

    public GenericBranch(T data){
        this.data = data;
    }

    public GenericBranch getLeftBranch() {
        return leftBranch;
    }

    public void setLeftBranch(GenericBranch leftBranch) {
        this.leftBranch = leftBranch;
    }

    public GenericBranch getRightBranch() {
        return rightBranch;
    }

    public void setRightBranch(GenericBranch rightBranch) {
        this.rightBranch = rightBranch;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    public String toString(){
        return data.toString();
        /*
        methods like toString, equals, and hashcode
        are inherited from the Object class

         */
    }


    @Override
    public int compareTo(GenericBranch o) {
        return data.compareTo((T) o.getData());
    }
}
