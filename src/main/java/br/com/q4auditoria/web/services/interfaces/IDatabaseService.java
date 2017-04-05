package br.com.q4auditoria.web.services.interfaces;

public interface IDatabaseService {

	public IAcaoService getAcaoService();
	
	public IAcaoFuncionalidadeService getAcaoFuncionalidadeServie();
	
	public IFuncionalidadeService getFuncionalidadeService();
	
	public IMenuService getMenuService();
	
	public IPerfilAcaoFuncionalidadeService getPerfilAcaoFuncionalidadeService();
	
	public IPerfilService getPerfilService();
	
	public IUsuarioService getUsuarioService();

}
