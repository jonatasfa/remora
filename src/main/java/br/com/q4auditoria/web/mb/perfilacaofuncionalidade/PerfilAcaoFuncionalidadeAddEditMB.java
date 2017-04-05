package br.com.q4auditoria.web.mb.perfilacaofuncionalidade;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.q4auditoria.web.models.PerfilAcaoFuncionalidadeEntity;
import br.com.q4auditoria.web.services.interfaces.IPerfilAcaoFuncionalidadeService;
import br.com.q4auditoria.web.utils.BaseEntity;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "perfilAcaoFuncionalidadeAddEditMB")
public class PerfilAcaoFuncionalidadeAddEditMB extends BaseEntity {

	private static final long serialVersionUID = 3119597905313363815L;
	
	@Inject
	private IPerfilAcaoFuncionalidadeService perfilAcaoFuncionalidadeService;
	
	@Inject
	private PerfilAcaoFuncionalidadeMB mbPerfilAcaoFuncionalidadeBean;
	
	private PerfilAcaoFuncionalidadeEntity perfilAcaoFuncionalidade;
	
	private String title;
	
	public PerfilAcaoFuncionalidadeAddEditMB(){
		this.perfilAcaoFuncionalidade = new PerfilAcaoFuncionalidadeEntity();
	}
	
	public PerfilAcaoFuncionalidadeEntity getPerfilAcaoFuncionalidade(){
		return this.perfilAcaoFuncionalidade;
	}
	
	public void add(){
		this.title = "Adicionar";
	}
	
	public void update(){
		this.perfilAcaoFuncionalidade = mbPerfilAcaoFuncionalidadeBean.getSelectedPerfilAcaoFuncionalidade();
		this.title = "Adicionar";
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void save(){
		if (this.perfilAcaoFuncionalidade.getPfId() != null){
			this.perfilAcaoFuncionalidadeService.insert(perfilAcaoFuncionalidade);
		}else{
			this.perfilAcaoFuncionalidadeService.update(perfilAcaoFuncionalidade);
		}
	}

}
