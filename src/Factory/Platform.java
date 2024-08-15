package Factory;

public abstract class Platform {

    public void setRefreshRate(){

    }
    public void setThem(){

    }
    public static Platform getPlatform(String PlatForm){
        return PlatformFactory.getPlatform(PlatForm);
    }
    public abstract UIComponentFactory createUIComponentFactory();    //Android and IOS are coming out of platform only
}
