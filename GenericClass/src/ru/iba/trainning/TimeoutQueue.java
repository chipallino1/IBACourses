package ru.iba.trainning;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

public class TimeoutQueue<T> {

	private List<T> queue;
	
	public TimeoutQueue()
	{
		queue=new ArrayList<T>();
	}
	
	public void offer(T t,long millis)
	{
		queue.add(t);
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				queue.remove(t);
				
			}
			
		}, millis);
	}
	public T poll()
	{
		if(queue.size()>0)
		{
			return queue.get(0);
		}
		return null;
	}
	public int size()
	{
		return queue.size();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		TimeoutQueue<Integer> timeoutQueue=new TimeoutQueue<Integer>();
		timeoutQueue.offer(new Integer(1), 1000);
		timeoutQueue.offer(new Integer(2), 2000);
		timeoutQueue.offer(new Integer(3), 500);
		timeoutQueue.offer(new Integer(4), 1000);
		timeoutQueue.offer(new Integer(5), 2000);
		timeoutQueue.offer(new Integer(6), 500);
		
		System.out.println("size "+timeoutQueue.size());
		
		
		
		Timer timer =new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("size "+timeoutQueue.size());
				System.out.println("poll "+timeoutQueue.poll());
			}
			
		}, 1000);
		
		//System.out.println("size "+timeoutQueue.size());
		
	}

}
