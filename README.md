# naivebayes_bigdata

# Meaning
A naive Bayesian classifier is a probabilistic classifier based on Bayes' theorem and some simplifying hypotheses.

The naive or simple Bayesian classifier (NBC) is based on the assumption that all the attributes are independent given the class variable. 

The naive Bayes formulation drastically reduces the complexity of the Bayesian classifier, as in this case we only require the prior probability (one dimensional vector) of the class, and the n conditional probabilities of each attribute given the class (two dimensional matrices). The space requirement is reduced from exponential to linear in the number of attributes. 



# Bayes Theorem
In probability theory, it is a proposition raised by the English mathematician Thomas Bayes and published posthumously in 1763, which expresses the conditional probability of:

  "A random event A given B in terms of the conditional probability distribution of event B given A and the marginal probability distribution of only A"
  
 ![Bayes Theorem](https://miro.medium.com/max/1468/1*LB-G6WBuswEfpg20FMighA.png) 
 
 # Example
 
 # Bayesian Classifiers: Multinomial
The Naive Bayes Multinomial model considers the frequency of occurrence of each term in xt documents instead of a binary occurrence.

It is mainly used for document classification problems, that is, if a document belongs to the category of sports, politics, technology, etc.

The characteristics/predictors used by the classifier are the frequency of the words present in the document.

# Bayesian Classifiers: Bernoulli Distribution
It corresponds to a discrete probability distribution, used in dichotomous experiments, that is, with two possible outcomes, success or failure.

Considering:
x: Success variable #
P: Probability of success
Q: Probability of Failure

Probability Function:
f (x) = P ^ x (1-P) ^ 1-x

Bernoulli's distribution has 3 possible values:
x = 1 f (x; P) = P
x = 0 f (x; Q) = Q
x = a (f; P) = 0

