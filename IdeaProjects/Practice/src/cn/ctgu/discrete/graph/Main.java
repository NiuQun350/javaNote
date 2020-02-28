package cn.ctgu.discrete.graph;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author NiuQun
 */
public class Main {

	
	public static void main(String[] args) {
		// 输入一个图的邻接矩阵
		int[][] adjacencyMatrix = inputInfo();
		// 实现一个图
		GraphRepresentation graph1 = new GraphRepresentation(adjacencyMatrix);
		// 打印相关信息
		outputInfo(graph1);
	}

	public static void outputInfo(GraphRepresentation graph) {
		System.out.println("该图的邻接矩阵为：");
		graph.adjacencyMatrixOfGraph();
		for (int i = 0; i < graph.getAdjacencyMatrix().length; i++) {
			System.out.println("第" + i + "个点的入度为:" + graph.inDegreeOfVertex(i));
		}

		for (int i = 0; i < graph.getAdjacencyMatrix().length; i++) {
			System.out.println("第" + i + "个点的出度为:" + graph.outDegreeOfVertex(i));
		}
		System.out.println("整个图的度为:" + graph.degreeOfGraph());
		System.out.println("整个图的最大度为:" + graph.maxDegreeOfGraph());
		System.out.println("整个图的最小度为:" + graph.minDegreeOfGraph());
		System.out.println("该图是不是简单图：" + graph.isSimpleGraph());
		for (int i = 1; i <= 4; i++) {
			System.out.println("该图中长度为" + i + "的通路数为：" + graph.pathCount(i));
		}
		System.out.println();
		for (int i = 1; i <= 4; i++) {
			System.out.println("该图中长度为" + i + "的回路数为：" + graph.loopCount(i));
		}
		System.out.println("该图的可达矩阵为：");
		for (int[] temp: graph.reachabilityMatrixOfGraph()) {
			System.out.println(Arrays.toString(temp));
		}
	}

	public static int[][] inputInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入邻接矩阵的维度：");
		int latitude = scanner.nextInt();
		System.out.println("请输入一个邻接矩阵：");
		int[][] adjacencyMatrix= new int[latitude][latitude];
		for(int i = 0; i < latitude; i++) {
			for (int j = 0; j < latitude; j++) {
				adjacencyMatrix[i][j] = scanner.nextInt();
			}
		}
		return adjacencyMatrix;
	}
}

class GraphRepresentation {
	int[][] adjacencyMatrix;

	public GraphRepresentation(int[][] adjacencyMatrix) {
		super();
		this.adjacencyMatrix = adjacencyMatrix;
	}

	public int[][] getAdjacencyMatrix() {
		return adjacencyMatrix;
	}

	public void setAdjacencyMatrix(int[][] adjacencyMatrix) {
		this.adjacencyMatrix = adjacencyMatrix;
	}
   /**
    * AdjacencyMatrixOfGraph方法用于显示图对应的邻接矩阵
    */
	public void adjacencyMatrixOfGraph() {
		for(int[] temp: adjacencyMatrix) {
			System.out.println(Arrays.toString(temp));
		}
	}

	/**
	 * inDegreeOfVertex用于返回某个点的入度
	 * @return
	 */
	public int inDegreeOfVertex(int vertex) {
		int  count = 0;
		for(int i = 0; i < adjacencyMatrix.length; i++) {
			count = count + adjacencyMatrix[i][vertex];
		}
		return count;
	}
	/**
	 * inDegreeOfVertex用于返回某个点的出度
	 * @return
	 */
	public int outDegreeOfVertex(int vertex) {
		int count = 0;
		for(int i = 0; i < adjacencyMatrix.length; i++) {
			count = count + adjacencyMatrix[vertex][i];
		}
		return count;
	}
	/**
	 * degreeOfVertex方法用于返回某个点的度
	 * @return
	 */
	public int degreeOfVertex(int vertex) {
		return inDegreeOfVertex(vertex) + outDegreeOfVertex(vertex); 
	}
	/**
	 * maxDegreeOfGraph方法用于返回图的最大度
	 * @return
	 */
	public int maxDegreeOfGraph() {
		int max = 0;
		for (int i = 0; i < adjacencyMatrix.length; i++) {
			if (max < degreeOfVertex(i)) {
				max = degreeOfVertex(i);
			}
		}
		return max;
	}
	
	/**
	 * minDegreeOfGraph方法用于返回图的最小度
	 * @return
	 */
	public int minDegreeOfGraph() {
		int min = degreeOfVertex(0);
		for (int i = 0; i < adjacencyMatrix.length; i++) {
			if (min > degreeOfVertex(i)) {
				min = degreeOfVertex(i);
			}
		}
		return min;
	}
	/**
	 * degreesOfGraph方法用于显示图的度数
	 */
	public int degreeOfGraph() {
		int count = 0;
		for(int i = 0; i < adjacencyMatrix.length; i++) {
		count = count + degreeOfVertex(i);
		}	
		return count;
	}
	
	public boolean isSimpleGraph() {
		/**
		 * 如果主对角线不全为0，即有环，则不是简单图
		 */
		 for(int i = 0; i < adjacencyMatrix.length; i++) {
			if(adjacencyMatrix[i][i] != 0) {
				return false;
			}
		}

		/**
		 * 如果非主对角线的元素大于1，则存在平行边，则不是简单图
		 *
		 */
		for(int i = 0; i < adjacencyMatrix.length; i++) {
			for(int j = 0; j < adjacencyMatrix.length; j++) {
				if(adjacencyMatrix[i][j] != 0 && adjacencyMatrix[i][j] != 1) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * matrixPowerOperation方法用于邻接矩阵的幂运算
	 * @return
	 */
	public int[][] matrixPowerOperation(int power) {
		int[][] temp = new int[adjacencyMatrix.length][adjacencyMatrix.length];
		// 将temp1矩阵初始化为单位矩阵
		for (int i = 0; i < adjacencyMatrix.length; i++) {
			for (int j = 0; j < adjacencyMatrix.length; j++) {
				if (i == j) {
					temp[i][j] = 1;
				} else {
					temp[i][j] = 0;
				}
			}
		}

		for (int n = 0; n < power; n++) {
			temp = matrixMultiplication(temp, adjacencyMatrix);
		}
		return temp;
	}

	/**
	 * canMatrixMultiplication方法用于判断两个矩阵是否能够相乘
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean canMatrixMultiplication(int[][] x, int[][] y) {
		return x[0].length == y.length;
	}

	/**
	 * matrixMultiplication方法用于进行两个矩阵的乘法运算
	 * @param x
	 * @param y
	 * @return
	 */
	public int[][] matrixMultiplication(int[][] x, int[][] y) {
		int[][] temp1 = new int[x.length][y[0].length];
		if (canMatrixMultiplication(x, y)) {
			for (int i = 0; i < x.length; i++) {
				for (int j =  0; j < y[0].length; j++) {
					for (int k = 0; k < x[0].length; k++) {
						temp1[i][j] = temp1[i][j] + x[i][k] * y[k][j];
					}
				}
			}
		}
		return temp1;
	}

	/**
	 * pathCount方法用于得到图中长度为pathLength的通路数
	 * @param pathLength
	 * @return
	 */
	public int pathCount(int pathLength) {
		// 得到图的邻接矩阵的pathLength次幂
		int[][] newAdjacencyMatrix = matrixPowerOperation(pathLength);
		int count = 0;

		for (int i = 0; i < newAdjacencyMatrix.length; i++) {
			for (int j = 0; j < newAdjacencyMatrix.length; j++) {
				count += newAdjacencyMatrix[i][j];
			}
		}
		return count;
	}

	/**
	 * pathCount方法用于得到图中长度为pathLength的回路数
	 * @param pathLength
	 * @return
	 */
	public int loopCount(int pathLength) {
		// 得到图的邻接矩阵的pathLength次幂
		int[][] newAdjacencyMatrix = matrixPowerOperation(pathLength);
		int count = 0;
		for (int i = 0; i < newAdjacencyMatrix.length; i++) {
				count += newAdjacencyMatrix[i][i];
		}
		return count;
	}

	/**
	 * 矩阵相加
	 * @param x
	 * @param y
	 * @return
	 */
	public int[][] matrixAddition(int[][] x, int[][] y) {
		int[][] newAdjacencyMatrix = new int[adjacencyMatrix.length][adjacencyMatrix.length];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				newAdjacencyMatrix[i][j] = x[i][j] + y[i][j];
			}
		}
		return newAdjacencyMatrix;
	}

	/**
	 * 获得一个图的可达矩阵
	 * @return
	 */
	public int[][] reachabilityMatrixOfGraph() {
		// 定义一个临时矩阵用于保存邻接矩阵的1～n次幂之和
		int[][] newAdjacencyMatrix = new int[adjacencyMatrix.length][adjacencyMatrix.length];
		for (int i = 1; i <= adjacencyMatrix.length; i++) {
			newAdjacencyMatrix = matrixAddition(newAdjacencyMatrix, matrixPowerOperation(i));
		}
		// 定义可达矩阵
		int[][] reachabilityMatrix = new int[adjacencyMatrix.length][adjacencyMatrix.length];
		for (int i = 0; i < reachabilityMatrix.length; i++) {
			for (int j = 0; j < reachabilityMatrix.length; j++) {
				if (newAdjacencyMatrix[i][j] != 0) {
					reachabilityMatrix[i][j] = 1;
				} else {
					reachabilityMatrix[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < reachabilityMatrix.length; i++) {
			reachabilityMatrix[i][i] = 1;
		}
		return reachabilityMatrix;
	}
}