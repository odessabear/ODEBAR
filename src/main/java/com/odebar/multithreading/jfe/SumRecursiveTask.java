package com.odebar.multithreading.jfe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class SumRecursiveTask extends RecursiveTask<Long> {
    private List<Long> longList;
    private int begin;
    private int end;
    public static final long THRESHOLD = 10_000;

    public SumRecursiveTask(List<Long> longList) {
        this(longList, 0, longList.size());
    }

    private SumRecursiveTask(List<Long> longList, int begin, int end) {
        this.longList = longList;
        this.begin = begin;
        this.end = end;
    }

//    @Override
//    protected Long compute() {
//        int length = end - begin;
//        long result = 0;
//        if (length <= THRESHOLD) {
//            for (int i = begin; i < end; i++) {
//                result += longList.get(i);
//            }
//        } else {
//            int middle = begin + length / 2;
//            SumRecursiveTask taskLeft = new SumRecursiveTask(longList, begin, middle);
//            taskLeft.fork(); // run async
//            SumRecursiveTask taskRight = new SumRecursiveTask(longList, middle, end);
//            taskRight.fork();//or compute()
//            Long leftSum = taskLeft.join();
//            Long rightSum = taskRight.join();
//            result = leftSum + rightSum;
//        }
//        return result;
//    }

    protected Long compute() {
        int length = end - begin;
        long result = 0;
        if (length <= THRESHOLD) {
            for (int i = begin; i < end; i++) {
                result += longList.get(i);
            }
        } else {
            int middle = begin + length / 2;
            List<SumRecursiveTask> tasks = new ArrayList<>();
            tasks.add(new SumRecursiveTask(longList, begin, middle));
            tasks.add(new SumRecursiveTask(longList, middle, end));
/* # 6 # fork/join для задач без возвращаемого значения # UnaryAction.java
# UnaryActionMain.java */
            tasks.forEach(RecursiveTask::fork);
            result = tasks.stream()
                    .map(RecursiveTask::join)
                    .reduce(Long::sum)
                    .orElse(0L);
        }
        return result;
    }
}
