<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fo="http://www.w3.org/1999/XSL/Format"
                xmlns:xs="http://www.w3.org/2001/XMLSchema"
                xmlns:fn="http://www.w3.org/2005/xpath-functions">

    <xsl:template match="Resource">
        <html>
            <head>
                <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
                <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
                      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"/>
            </head>
            <body>
                <div class="container" style="padding-top:25px">
                    <table class="table table-striped">
                        <tbody>
                            <tr>
                                <th scope="row" style="width:200px">
                                    Resource Name
                                </th>
                                <td id="resName">
                                    <xsl:value-of select="@table"/>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row"  style="width:200px">
                                    Resource Description
                                </th>
                                <td>
                                    <xsl:choose>
                                        <xsl:when test='string-length(Desc) &gt; 0'>
                                            <xsl:value-of select="Desc"/>
                                        </xsl:when>
                                        <xsl:otherwise>Not Given
                                        </xsl:otherwise>
                                    </xsl:choose>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row" style="width:200px">
                                    API Version:
                                </th>
                                <td>
                                    <xsl:value-of select="@version"/>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                    
                    <xsl:for-each select="Request">
                        
                        <div class="col-md-8" style="padding-top:10px">

                        <xsl:choose>    
                            <xsl:when test="contains(@item,'true')" >                      
                                <div class="panel panel-success">
                                    
                                <div class="panel-heading">
                                    <span style="font-weight:bold">ITEM REQUEST</span>
                                    
                                    <xsl:choose>
                                        <xsl:when test="contains(@method,'GET')">
                                            <div style="font-size:14px" class="label label-success pull-right">
                                                GET
                                            </div>    
                                        </xsl:when>
                                        <xsl:when test="contains(@method,'POST')">
                                            <div style="font-size:14px" class="label label-info pull-right">
                                                POST
                                            </div>    
                                        </xsl:when>
                                        <xsl:when test="contains(@method,'PUT')">
                                            <div style="font-size:14px" class="label label-warning pull-right">
                                                PUT
                                            </div>    
                                        </xsl:when>
                                        <xsl:when test="contains(@method,'DELETE')">
                                            <div style="font-size:14px" class="label label-danger pull-right">
                                                DELETE
                                            </div>    
                                        </xsl:when>
                                    </xsl:choose>
                                    
                                </div>    
                                <div class="panel-body">
                                    <div>
                                        <div style="color:darkgrey;font-weight:bold;">
                                                Description
                                        </div>
                                        <xsl:choose>
                                            <xsl:when test='string-length(Desc) &gt; 0'>
                                                <xsl:value-of select="Desc"/>
                                            </xsl:when>
                                            <xsl:otherwise>
                                                <div>-</div>
                                            </xsl:otherwise>        
                                        </xsl:choose>
                                    </div>
                                    <div style="padding-top:12px">
                                        <div style="color:darkgrey;font-weight:bold;">
                                            Response Status
                                        </div>
                                        <xsl:choose>
                                            <xsl:when test='string-length(@status) &gt; 0'>
                                                <xsl:value-of select="@status"/>
                                            </xsl:when>    
                                            <xsl:otherwise>
                                                <div>-</div>
                                            </xsl:otherwise>
                                        </xsl:choose>
                                    </div>
                                    <div style="padding-top:12px">
                                        <div style="color:darkgrey;font-weight:bold;">
                                            Param(s)
                                        </div>
                                        <div class="paramList" style="padding-top:8px;font-size:16px;">
                                            <xsl:choose>
                                                <xsl:when test="Param">
                                                    <xsl:for-each select="Param">
                                                        <span class="label label-primary" style="margin-right:5px"> 
                                                            <xsl:value-of select="@name"/>
                                                        </span>
                                                    </xsl:for-each>
                                                </xsl:when>
                                            </xsl:choose>
                                            
                                            <xsl:for-each select="Sql">
                                                <xsl:choose>
                                                    <xsl:when test="@when">
                                                        <xsl:analyze-string select="@when" regex="@(\w+)">
                                                            <xsl:matching-substring>
                                                                <span class="label label-primary" style="margin-right:5px">
                                                                    <xsl:value-of select="regex-group(1)"/>
                                                                </span>    
                                                            </xsl:matching-substring>
                                                            <xsl:non-matching-substring>
                                                            </xsl:non-matching-substring>
                                                        </xsl:analyze-string>
                                                    </xsl:when>
                                                </xsl:choose>
                                            </xsl:for-each>                                            
                                                
                                            <xsl:analyze-string select="." regex="@(\w+)">
                                                <xsl:matching-substring>
                                                    <span>
                                                        <xsl:value-of select="regex-group(1)"/>
                                                    </span>
                                                </xsl:matching-substring>
                                                <xsl:non-matching-substring>
                                                </xsl:non-matching-substring>
                                            </xsl:analyze-string>
                                        </div>     
                                    </div>
                                        
                                </div>    
                            </div>                            
                            </xsl:when>
                            <xsl:otherwise>
                                <div class="panel panel-info">
                                <div class="panel-heading">
                                    <span style="font-weight:bold">COLLECTION REQUEST</span>
                                    
                                    <xsl:choose>
                                        <xsl:when test="contains(@method,'GET')">
                                            <div class="label label-success pull-right" style="font-size:14px">
                                                GET
                                            </div>    
                                        </xsl:when>
                                        <xsl:when test="contains(@method,'POST')">
                                            <div class="label label-info pull-right" style="font-size:14px">
                                                POST
                                            </div>    
                                        </xsl:when>
                                        <xsl:when test="contains(@method,'PUT')">
                                            <div class="label label-warning pull-right" style="font-size:14px">
                                                PUT
                                            </div>    
                                        </xsl:when>
                                        <xsl:when test="contains(@method,'DELETE')">
                                            <div class="label label-danger pull-right" style="font-size:14px">
                                                DELETE
                                            </div>    
                                        </xsl:when>
                                    </xsl:choose>
                                    
                                </div>    
                                <div class="panel-body">
                                    <div>
                                        <div style="color:darkgrey;font-weight:bold;">
                                            Description
                                        </div>
                                        <xsl:choose>
                                            <xsl:when test='string-length(Desc) &gt; 0'>
                                                <xsl:value-of select="Desc"/>
                                            </xsl:when>
                                            <xsl:otherwise>
                                                <div>-</div>
                                            </xsl:otherwise>        
                                        </xsl:choose>
                                    </div>
                                    <div style="padding-top:12px">
                                        <div style="color:darkgrey;font-weight:bold;">
                                            Response Status
                                        </div>
                                        <xsl:choose>
                                            <xsl:when test='string-length(@status) &gt; 0'>
                                                <xsl:value-of select="@status"/>
                                            </xsl:when>    
                                            <xsl:otherwise>
                                                <div>-</div>
                                            </xsl:otherwise>
                                        </xsl:choose>
                                    </div>  
                                    <div style="padding-top:12px">
                                        <div style="color:darkgrey;font-weight:bold;">
                                            Param(s)
                                        </div>
                                        <div class="paramList" style="padding-top:8px;font-size:16px;">
                                            <xsl:choose>
                                                <xsl:when test="Param">
                                                    <xsl:for-each select="Param">
                                                        <span> 
                                                            <xsl:value-of select="@name"/>
                                                        </span>
                                                    </xsl:for-each>
                                                </xsl:when>
                                            </xsl:choose>
                                            
                                            <xsl:for-each select="Sql">
                                                <xsl:choose>
                                                    <xsl:when test="@when">
                                                        <xsl:analyze-string select="@when" regex="@(\w+)">
                                                            <xsl:matching-substring>
                                                                <span class="label label-primary" style="margin-right:5px">
                                                                    <xsl:value-of select="regex-group(1)"/>
                                                                </span>    
                                                            </xsl:matching-substring>
                                                            <xsl:non-matching-substring>
                                                            </xsl:non-matching-substring>
                                                        </xsl:analyze-string>
                                                    </xsl:when>
                                                </xsl:choose>
                                            </xsl:for-each>
                                                
                                            <xsl:analyze-string select="." regex="@(\w+)">
                                                <xsl:matching-substring>
                                                    <span class="label label-primary" style="margin-right:5px">
                                                        <xsl:value-of select="regex-group(1)"/>
                                                    </span>    
                                                </xsl:matching-substring>
                                                <xsl:non-matching-substring>
                                                </xsl:non-matching-substring>
                                            </xsl:analyze-string>
                                        </div>     
                                    </div>    
                                                                           
                                </div>    
                            </div>
                            </xsl:otherwise>                               
                        </xsl:choose>
                            
                        </div>    
                    </xsl:for-each>    
                    
                    
                    <!--<table class="table table-striped">
                        <thead class="thead-inverse">
                            <tr>
                                <th>Type</th>
                                <th>Description
</th>
                                <th>Parameter</th>
                                <th>Method</th>
                                <th>Condition</th>
                                <th>Output</th>
                            </tr>
                        </thead>
                        <tbody>

                            <xsl:for-each select="Request">
                                <xsl:for-each select="Sql">
                                    <tr>-->
                                        <!--TD for query-type
                                        <td>
                                            <xsl:choose>
                                                <xsl:when test="contains(@type,'query')">
                                                    Query
                                                </xsl:when>
                                                <xsl:otherwise>
                                                    Update
                                                </xsl:otherwise>
                                            </xsl:choose>
                                        </td>-->
                                        <!--TD for description
                                        <td>
                                            <xsl:value-of select="../Desc"/>
                                        </td>-->
                                        <!--TD for parameter list
                                        <td>
                                            <xsl:analyze-string select="." regex="@(\w+)">
                                                <xsl:matching-substring>
                                                    <xsl:value-of select="concat(regex-group(1),', ')"/>
                                                </xsl:matching-substring>
                                                <xsl:non-matching-substring>
                                                </xsl:non-matching-substring>
                                            </xsl:analyze-string>
                                        </td>-->
                                        <!--TD for request method
                                        <td>
                                            <xsl:value-of select="../@method"/>
                                        </td>-->
                                        <!--TD for condition
                                        <td>
                                            <xsl:value-of select="replace(@when,'@','')"/>
                                        </td>-->
                                        <!--TD for output format
                                        <td>
                                            <xsl:choose>
                                                <xsl:when test='string-length(@Out) &gt; 0'>
                                                    <xsl:value-of select="@Out"/>
                                                </xsl:when>
                                                <xsl:otherwise>json
                                                </xsl:otherwise>
                                            </xsl:choose>
                                        </td>
                                    </tr>
                                </xsl:for-each>
                            </xsl:for-each>
                        </tbody>
                    </table>-->
                </div>
                <script>
                    var url = window.location.href;
                    var resName = url.substr(url.lastIndexOf('/')+1);
                    var resNameDiv = document.getElementById('resName');
                    resName = resName.slice(0,-5);
                    resNameDiv.innerHTML = resName;
                    document.title = resName;        
                                
                    var paramListClasses = document.getElementsByClassName("paramList");
                    for (var i = 0; i &lt; paramListClasses.length; i++) {
                        //console.log(paramListClasses[i]);
                        var unique = [];
                        var paramList = paramListClasses[i].childNodes;
                        for(var j = 0; j &lt; paramList.length; j++){
                            var param = paramList[j];
                            unique.push(param.innerHTML);
                            unique = eliminateDuplicates(unique);
                        }
                        //console.log("unique: "+unique);
                        var l = paramList.length;
                        for(var j=l-1; j &gt;= 0; j--){
                            paramList[j].parentNode.removeChild(paramList[j]);
                        }
                        for(var j=0; j &lt; unique.length; j++){
                            var span = document.createElement('span');
                            span.classList.add('label','label-primary');
                            span.innerHTML = unique[j];
                            span.style['margin-right'] = '5px';
                            paramListClasses[i].appendChild(span);
                        }                                                                                        
                    }
                    function eliminateDuplicates(arr) {
                        var i, len=arr.length, out=[], obj={};
                        for (i=0;i &lt; len;i++) {
                            obj[arr[i]]=0;
                        }
                        for (i in obj) {
                            out.push(i);
                        }
                        return out;
                    }
                </script>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
