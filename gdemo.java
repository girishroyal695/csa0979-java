class TwoGenerics<T>
{
    T a;
    T b;
    TwoGenerics(T a1,T b1)
    {
        a=a1;
        b=b1;
    }
    void swap()
    {
        T c=a;
        a=b;
        b=c;
    }
    void print()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
class Gdemo
{
    public static void main(String args[])
    {
        TwoGenerics<Double>obj=new TwoGenerics<Double>(17.9,18.6);
        System.out.println("before swapping");
        obj.print();
        System.out.println("before swapping");
        obj.swap();
        obj.print();
        TwoGenerics<String>obj1=new TwoGenerics<String>("ramu","sita");
        System.out.println("before swapping");
        obj1.print();
        System.out.println("before swapping");
        obj1.swap();
        obj1.print();
    }
}
