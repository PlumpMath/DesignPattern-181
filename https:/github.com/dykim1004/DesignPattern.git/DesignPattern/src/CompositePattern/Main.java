package CompositePattern;

public class Main {

	// 컴퍼짓 패턴을 통해서 트리 구조 표현
	/*
	 * 파일 시스템
	 */
	public static void main(String[] args) {
		Folder 
			   root = new Folder("root"), 
			   home  = new Folder("home"), 
			   garam = new Folder("garam"), 
			   music = new Folder("music"), 
			   picture = new Folder("picture"), 
			   doc = new Folder("doc"), 
			   usr = new Folder("usr");
		
		File 
			 track1 = new File("track1"), 
			 track2 = new File("track2"), 
			 pic1 = new File("pic1"), 
			 doc1 = new File("doc1"), 
			 java = new File("java");
		
		
		root.addComponent(home);
			home.addComponent(garam);
				garam.addComponent(music);
					music.addComponent(track1);
					music.addComponent(track2);
				garam.addComponent(picture);
					picture.addComponent(pic1);
				garam.addComponent(doc);
					doc.addComponent(doc1);
		
		root.addComponent(usr);
			usr.addComponent(java);
			
			show(root);
		
	}
	
	private static void show(Component component){
		System.out.println(component.getClass().getName()+"|"+component.getName());
		if(component instanceof Folder){
			for(Component c : ((Folder)component).getChildren()){
				show(c);
			}
		}
	}
	
}
