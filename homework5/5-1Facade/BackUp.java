public class BackUp {
    public static void backUp(){
           String d1=MessageManager.getProperty();
           String d2=MusicManager.getProperty();
           String d3=ContactManager.getProperty();
           String d4=AlbumManager.getProperty();
           SDCard.Save(d1);
           SDCard.Save(d2);
           SDCard.Save(d3);
           SDCard.Save(d4);
           MMCCard.Save(d1);
           MMCCard.Save(d2);
           MMCCard.Save(d3);
           MMCCard.Save(d4);
    }
}
