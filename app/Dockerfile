# Use a versão Alpine do Amazon Corretto 17
FROM amazoncorretto:17-alpine-jdk

LABEL version="1.0"
LABEL description="Imagem de Java 17 com Maven"

# Definir variáveis de ambiente para a versão do Maven
ENV MAVEN_VERSION=3.9.4
ENV MAVEN_HOME=/usr/lib/mvn
ENV PATH=$MAVEN_HOME/bin:$PATH

# Instalar dependências necessárias e o Maven
RUN apk add --no-cache curl bash && \
    mkdir -p /usr/share/maven /usr/lib/mvn && \
    curl -fsSL https://apache.osuosl.org/maven/maven-3/"$MAVEN_VERSION"/binaries/apache-maven-"$MAVEN_VERSION"-bin.tar.gz \
    | tar -xzC /usr/lib/mvn --strip-components=1 && \
    ln -s /usr/lib/mvn/bin/mvn /usr/bin/mvn

# Verificar as versões instaladas
RUN java -version && mvn -version

# Defina o diretório de trabalho dentro do contêiner
WORKDIR /workspace

# Copiar o conteúdo da pasta demo (projeto Java) para o diretório de trabalho no container
COPY . ./

# Comando para compilar o projeto
#RUN mvn clean install

# Comando para manter o contêiner em execução
CMD ["tail", "-f", "/dev/null"]
