package top.jiaway.headfirst.Observer;

public interface Observer {

    /**
     * 当观测数据改变时，调用
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp,float humidity,float pressure);
}
