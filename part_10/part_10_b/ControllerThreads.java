package part_10.part_10_b;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

public class ControllerThreads {

    public static void main(String[] args) {

        System.out.println("main method starting");
        CustomThreads thread_1 = new CustomThreads("thread_1");
        CustomThreads thread_2 = new CustomThreads("thread_2");
        CustomThreads thread_3 = new CustomThreads("thread_3");

        RunnableThreads runnableThread_1 = new RunnableThreads("runnableThread_1");
        RunnableThreads runnableThread_2 = new RunnableThreads("runnableThread_2");
        RunnableThreads runnableThread_3 = new RunnableThreads("runnableThread_3");

        System.out.println("main method finished");
    }
}
