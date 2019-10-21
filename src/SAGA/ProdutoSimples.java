package SAGA;
/**
 * Representação de um produto no sistema. Cada produto possui nome, descrição, preço e tipo
 * @author Thiago Lira.
 *
 */
public class ProdutoSimples implements Produto{

	private String nome;
	private String descricao;
	private double preco;
	private String tipo;

	/**
	 * Contrói um produto com os parametros passados
	 * @param nome
	 * @param descricao
	 * @param preco
	 */
	public ProdutoSimples(String nome, String descricao, double preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.tipo = "Simples";
	}
	/**
	 * Constrói um produto usando apenas nome e descrição
	 * @param nomeProduto
	 * @param descricaoProduto
	 */
	public ProdutoSimples(String nomeProduto, String descricaoProduto) {
		this.nome = nomeProduto;
		this.descricao = descricaoProduto;
	}
	
	public void setPreco(double novoPreco) {
		this.preco = novoPreco;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public String getIdentificador() {
		return this.nome+ " - "+ this.descricao;
	}

	public double getPreco() {
		return preco;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	/**
	 * Representação textual de um produto
	 */
	@Override
	public String toString() {
		return nome + " - " + descricao + " - R$" +String.format("%.2f", preco);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoSimples other = (ProdutoSimples) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Produto outroProduto) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(outroProduto.getNome());
	}
	
}
