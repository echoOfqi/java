

# V1alpha2ResourceClaimSchedulingStatus

ResourceClaimSchedulingStatus contains information about one particular ResourceClaim with \"WaitForFirstConsumer\" allocation mode.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name matches the pod.spec.resourceClaims[*].Name field. |  [optional] |
|**unsuitableNodes** | **List&lt;String&gt;** | UnsuitableNodes lists nodes that the ResourceClaim cannot be allocated for.  The size of this field is limited to 128, the same as for PodSchedulingSpec.PotentialNodes. This may get increased in the future, but not reduced. |  [optional] |



