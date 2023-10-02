package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha2ResourceClaimTemplateListFluent<A extends V1alpha2ResourceClaimTemplateListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(int index,V1alpha2ResourceClaimTemplate item);
  public A setToItems(int index,V1alpha2ResourceClaimTemplate item);
  public A addToItems(io.kubernetes.client.openapi.models.V1alpha2ResourceClaimTemplate... items);
  public A addAllToItems(Collection<V1alpha2ResourceClaimTemplate> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1alpha2ResourceClaimTemplate... items);
  public A removeAllFromItems(Collection<V1alpha2ResourceClaimTemplate> items);
  public A removeMatchingFromItems(Predicate<V1alpha2ResourceClaimTemplateBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha2ResourceClaimTemplate> getItems();
  public List<V1alpha2ResourceClaimTemplate> buildItems();
  public V1alpha2ResourceClaimTemplate buildItem(int index);
  public V1alpha2ResourceClaimTemplate buildFirstItem();
  public V1alpha2ResourceClaimTemplate buildLastItem();
  public V1alpha2ResourceClaimTemplate buildMatchingItem(Predicate<V1alpha2ResourceClaimTemplateBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1alpha2ResourceClaimTemplateBuilder> predicate);
  public A withItems(List<V1alpha2ResourceClaimTemplate> items);
  public A withItems(io.kubernetes.client.openapi.models.V1alpha2ResourceClaimTemplate... items);
  public Boolean hasItems();
  public V1alpha2ResourceClaimTemplateListFluent.ItemsNested<A> addNewItem();
  public V1alpha2ResourceClaimTemplateListFluent.ItemsNested<A> addNewItemLike(V1alpha2ResourceClaimTemplate item);
  public V1alpha2ResourceClaimTemplateListFluent.ItemsNested<A> setNewItemLike(int index,V1alpha2ResourceClaimTemplate item);
  public V1alpha2ResourceClaimTemplateListFluent.ItemsNested<A> editItem(int index);
  public V1alpha2ResourceClaimTemplateListFluent.ItemsNested<A> editFirstItem();
  public V1alpha2ResourceClaimTemplateListFluent.ItemsNested<A> editLastItem();
  public V1alpha2ResourceClaimTemplateListFluent.ItemsNested<A> editMatchingItem(Predicate<V1alpha2ResourceClaimTemplateBuilder> predicate);
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ListMeta getMetadata();
  public V1ListMeta buildMetadata();
  public A withMetadata(V1ListMeta metadata);
  public Boolean hasMetadata();
  public V1alpha2ResourceClaimTemplateListFluent.MetadataNested<A> withNewMetadata();
  public V1alpha2ResourceClaimTemplateListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1alpha2ResourceClaimTemplateListFluent.MetadataNested<A> editMetadata();
  public V1alpha2ResourceClaimTemplateListFluent.MetadataNested<A> editOrNewMetadata();
  public V1alpha2ResourceClaimTemplateListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1alpha2ResourceClaimTemplateFluent<V1alpha2ResourceClaimTemplateListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1alpha2ResourceClaimTemplateListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}