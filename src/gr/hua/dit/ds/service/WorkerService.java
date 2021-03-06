package gr.hua.dit.ds.service;

import java.util.List;

import gr.hua.dit.ds.entity.Worker;

public interface WorkerService {
	public List<Worker> getWorkers();
	
	public void saveWorker(Worker worker);
	
	public Worker getWorker(int id);
	
	public void deleteWorker(int id);
}
