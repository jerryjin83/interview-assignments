package com.jerry.domainservice.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.jerry.domainservice.api.model.ShortDomainInformationDto;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response of generating the short domain information
 */
@Schema(description = "Response of generating the short domain information")
@Validated


public class GenerateResponseDto   {
  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("data")
  private ShortDomainInformationDto data = null;

  public GenerateResponseDto status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Status code of the service.
   * @return status
   **/
  @Schema(required = true, description = "Status code of the service.")
      @NotNull

    public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public GenerateResponseDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Error message of the service.
   * @return message
   **/
  @Schema(description = "Error message of the service.")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public GenerateResponseDto data(ShortDomainInformationDto data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @Schema(description = "")
  
    @Valid
    public ShortDomainInformationDto getData() {
    return data;
  }

  public void setData(ShortDomainInformationDto data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateResponseDto generateResponseDto = (GenerateResponseDto) o;
    return Objects.equals(this.status, generateResponseDto.status) &&
        Objects.equals(this.message, generateResponseDto.message) &&
        Objects.equals(this.data, generateResponseDto.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateResponseDto {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
