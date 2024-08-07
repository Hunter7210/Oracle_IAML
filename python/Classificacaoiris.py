import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import classification_report, accuracy_score
from sklearn.datasets import load_iris


# Carregar o conjunto de dados Íris
iris = load_iris()
data = pd.DataFrame(data=iris.data, columns=iris.feature_names)
data['target'] = iris.target


# Mostrar as primeiras linhas do DataFrame
print(data.head())


# Selecionar características e rótulos
X = data.drop('target', axis=1)
y = data['target']


# Dividir dados em treinamento e teste
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)



# Treinar modelo de floresta aleatória
model = RandomForestClassifier(n_estimators=100, random_state=42)
model.fit(X_train, y_train)


# Fazer previsões no conjunto de teste
y_pred = model.predict(X_test)


# Avaliar modelo
print('Acurácia:', accuracy_score(y_test, y_pred))
print('Relatório de Classificação:')
print(classification_report(y_test, y_pred))
