package Interfaces;

public interface Queue {
	void offer(Object e);// - добавить в конец очереди
	Object peek();// - вз€ть без удалени€, элемент из очереди
	Object poll();// - вз€ть и удалить элемент из очереди
}
