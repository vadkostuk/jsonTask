package parserGSON.runner;

import java.lang.reflect.Field;

public class VerifyObject {

    public boolean isObjectExist(Object object, String objectName) {
        Class<?> objectClass = object.getClass();
        for (Field field : objectClass.getDeclaredFields()) {
            if (field.getName().equals(objectName)) {
                return true;
            }
        }
        return false;
    }
}
