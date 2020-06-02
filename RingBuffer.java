public class RingBuffer {
    public int [] Ring;
    public int index=0;
    public RingBuffer(int a)
    {
        Ring= new int[a];
    }
    public void write(int a)
    {   
        index%=Ring.length;
        Ring[index]=a;
        System.out.println("1.현재 발생한 데이터는 "+ Ring[index]);
        index++;
    }
    public void read(int now)
    {   
        now%=Ring.length;
        System.out.println("2.현재 처리한 데이터는 "+ Ring[now]);
    }
}