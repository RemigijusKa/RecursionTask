# RecursionTask
The program creates dynamic data tree and calculates the deepest level (height) of that tree. 

Tree structure: 
		      	A
		       /  \
		      B	   D
		         / |   \
	      		G  H     J
		       /\  |    / \
		      C Z  W   X   Y
			      /
			     O

Child nodes have reference in parent node in a form of nodes ArrayList. 

There depth calculation method uses 'for each' cycle to explore every node's List of children nodes. Recursion is used in 'for each' cycle to explore deeper and deeper level of a tree.

Empty tree has 0 levels.
Tree with just one root node has 1 level.
The tree shown in example has the deepest level of 5. 


  

