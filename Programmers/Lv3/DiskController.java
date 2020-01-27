import java.util.*;
class DiskWork implements Comparable<DiskWork>{

    int req_time;
    int work_time;

    public DiskWork(int req_time, int work_time) {
        this.req_time = req_time;
        this.work_time = work_time;
    }
    @Override
    public String toString() {
        return "req : " + req_time + ", work : " + work_time;
    }
    @Override
    public int compareTo(DiskWork target) {
        if (this.work_time < target.work_time) return -1;
        else if (this.work_time == target.work_time) {
            if (this.req_time < target.req_time) return -1;
            else return 1;
        } else return 1;
    }
}
class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<DiskWork> workq = new PriorityQueue<DiskWork>();
        for(int i=0; i<jobs.length; i++){
            DiskWork work = new DiskWork(jobs[i][0], jobs[i][1]);
            workq.offer(work);
        }
        List<DiskWork> list = new ArrayList<>();
        while (!workq.isEmpty()) {
            list.add(workq.poll());
        }
        int temp_time = 0;
        int total_time = 0;
        while (list.size()>0) {
            for (int i = 0; i < list.size(); i++) {
                if (temp_time >= list.get(i).req_time) {
                    temp_time += list.get(i).work_time;
                    total_time += temp_time - list.get(i).req_time;
                    list.remove(i);
                    break;
                }
                if (i == list.size()-1) temp_time++;
            }
        }
        return (int)total_time/jobs.length;
    }
}