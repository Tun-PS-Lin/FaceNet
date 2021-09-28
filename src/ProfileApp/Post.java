package ProfileApp;

import DataStructure.AList;

public class Post {
	private AList<String> postList; 	//ALIST FOR POSTS
	private AList<String> timeStampList;	//ALIST for TIMESTAMPS
	
//	private AList<AList<String>> likeList;	//ALIST for LIKES
	
//	private class Comment {
//		private AList<String> commentPostList; 	//ALIST FOR POSTS
//		private AList<String> commentTimeStampList;	//ALIST for TIMESTAMPS
//		
//		private AList<AList<String>> commentLikeList;	//ALIST for LIKES
//	}
//	
//	private AList<Comment> commentList; 	//ALIST for COMMENTS
	
	/**
	 * CONSTRUSTOR - default constructor
	 */
	Post(){
		this(new AList <String>(), new AList<String>());
	}
	
	/**
	 * Full data constructor
	 * @param userPost - String - user's posts
	 * @param timeStamp - String - posts' time stamps
	 */
	Post(AList<String> postList, AList<String> timeStampList){
		this.postList = postList;
		this.timeStampList = timeStampList;
	}
	
	/**
	 * ACCESSORS
	 */
	public AList<String> getPostList() {
		return this.postList;
	}
	
	public AList<String> getTimeStampList() {
		return this.timeStampList;
	}
	
	/**
	 * MUTATORS
	 */
	public void setPostList(AList<String> postList) {
		this.postList = postList;
	}

	public void setTimeStampList(AList<String> timeStampList) {
		this.timeStampList = timeStampList;
	}

}


