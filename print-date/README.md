# Goal
Be able to test printCurrentDate function without changing the method signature.
1.- Test the code with doubles created by you.
2.- Test the code with doubles from a library.
# Code to test
	public void printCurrentDate() {
		System.out.println(new Date());
	}
# Learnings
How to build a Mock and Stub manually.

How to use Mockito to generate the doubles.

## Tools
[Mockito](http://mockito.org/) and [downloads](https://code.google.com/archive/p/mockito/downloads)
### Example of mock

	@Test
	public void should_interact_with_the_mock() {
		Collaborator collaborator = mock(Collaborator.class);		
		MyClass myClass = new MyClass(collaborator);
		
		myClass.run();
		
		verify(collaborator).collaborate();
	}
	
### Example of stub

	@Test
	public void should_retrieve_the_stub_response(){
		Collaborator collaborator = mock(Collaborator.class);		
		String collaboratorResponse = "collaborator response";
		when(collaborator.collaborate()).thenReturn(collaboratorResponse);
		MyClass myClass = new MyClass(collaborator);
		
		String result = myClass.run();
		
		assertEquals(result, collaboratorResponse);
	}
