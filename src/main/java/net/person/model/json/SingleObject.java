package net.person.model.json;

/**
 * Json对象类
 * Created by a2665 on 2018/2/4.
 */
public class SingleObject extends AbstractJsonObject{
    private Object object;
    public Object getObject() {
        return object;
    }
    public void setObject(Object object) {
        this.object = object;
    }
}