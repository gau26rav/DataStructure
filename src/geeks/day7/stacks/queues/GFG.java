package geeks.day7.stacks.queues;
class TwoStack
{
	int size;
	int top1,top2;
	int arr[] = new int[100];
	TwoStack()
	{
		size = 100;
		top1 = -1;
		top2 = size;
	}
}
class GfG
{
    // sq is the object of class TwoStack
    /* The method push to push element into the stack 2 */
    void push1(int x, TwoStack sq)
    {
        sq.top1++;
        sq.arr[sq.top1] = x;
    }
    /* The method push to push element into the stack 2*/
    void push2(int x, TwoStack sq)
    {
        sq.top2--;
        sq.arr[sq.top2] = x;
    }
    /* The method pop to pop element from the stack 1 */
    int pop1(TwoStack sq)
    {
        if(sq.top1==-1)
            return -1;
        int val = sq.arr[sq.top1];
        sq.top1--;
        return val;
    }
    /* The method pop to pop element from the stack 2 */
    int pop2(TwoStack sq)
    {
           if(sq.top2==100)
                return -1;
        int val = sq.arr[sq.top2];
        sq.top2++;
        return val;
    }
}
