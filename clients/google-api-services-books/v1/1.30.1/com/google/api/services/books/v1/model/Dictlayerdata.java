/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.books.v1.model;

/**
 * Model definition for Dictlayerdata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Books API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Dictlayerdata extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Common common;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dict dict;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * @return value or {@code null} for none
   */
  public Common getCommon() {
    return common;
  }

  /**
   * @param common common or {@code null} for none
   */
  public Dictlayerdata setCommon(Common common) {
    this.common = common;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Dict getDict() {
    return dict;
  }

  /**
   * @param dict dict or {@code null} for none
   */
  public Dictlayerdata setDict(Dict dict) {
    this.dict = dict;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * @param kind kind or {@code null} for none
   */
  public Dictlayerdata setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public Dictlayerdata set(String fieldName, Object value) {
    return (Dictlayerdata) super.set(fieldName, value);
  }

  @Override
  public Dictlayerdata clone() {
    return (Dictlayerdata) super.clone();
  }

  /**
   * Model definition for DictlayerdataCommon.
   */
  public static final class Common extends com.google.api.client.json.GenericJson {

    /**
     * The display title and localized canonical name to use when searching for this entity on Google
     * search.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String title;

    /**
     * The display title and localized canonical name to use when searching for this entity on Google
     * search.
     * @return value or {@code null} for none
     */
    public java.lang.String getTitle() {
      return title;
    }

    /**
     * The display title and localized canonical name to use when searching for this entity on Google
     * search.
     * @param title title or {@code null} for none
     */
    public Common setTitle(java.lang.String title) {
      this.title = title;
      return this;
    }

    @Override
    public Common set(String fieldName, Object value) {
      return (Common) super.set(fieldName, value);
    }

    @Override
    public Common clone() {
      return (Common) super.clone();
    }

  }

  /**
   * Model definition for DictlayerdataDict.
   */
  public static final class Dict extends com.google.api.client.json.GenericJson {

    /**
     * The source, url and attribution for this dictionary data.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Source source;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Words> words;

    static {
      // hack to force ProGuard to consider Words used, since otherwise it would be stripped out
      // see https://github.com/google/google-api-java-client/issues/543
      com.google.api.client.util.Data.nullOf(Words.class);
    }

    /**
     * The source, url and attribution for this dictionary data.
     * @return value or {@code null} for none
     */
    public Source getSource() {
      return source;
    }

    /**
     * The source, url and attribution for this dictionary data.
     * @param source source or {@code null} for none
     */
    public Dict setSource(Source source) {
      this.source = source;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<Words> getWords() {
      return words;
    }

    /**
     * @param words words or {@code null} for none
     */
    public Dict setWords(java.util.List<Words> words) {
      this.words = words;
      return this;
    }

    @Override
    public Dict set(String fieldName, Object value) {
      return (Dict) super.set(fieldName, value);
    }

    @Override
    public Dict clone() {
      return (Dict) super.clone();
    }

    /**
     * The source, url and attribution for this dictionary data.
     */
    public static final class Source extends com.google.api.client.json.GenericJson {

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String attribution;

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String url;

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getAttribution() {
        return attribution;
      }

      /**
       * @param attribution attribution or {@code null} for none
       */
      public Source setAttribution(java.lang.String attribution) {
        this.attribution = attribution;
        return this;
      }

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getUrl() {
        return url;
      }

      /**
       * @param url url or {@code null} for none
       */
      public Source setUrl(java.lang.String url) {
        this.url = url;
        return this;
      }

      @Override
      public Source set(String fieldName, Object value) {
        return (Source) super.set(fieldName, value);
      }

      @Override
      public Source clone() {
        return (Source) super.clone();
      }

    }
    /**
     * Model definition for DictlayerdataDictWords.
     */
    public static final class Words extends com.google.api.client.json.GenericJson {

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.util.List<Derivatives> derivatives;

      static {
        // hack to force ProGuard to consider Derivatives used, since otherwise it would be stripped out
        // see https://github.com/google/google-api-java-client/issues/543
        com.google.api.client.util.Data.nullOf(Derivatives.class);
      }

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.util.List<Examples> examples;

      static {
        // hack to force ProGuard to consider Examples used, since otherwise it would be stripped out
        // see https://github.com/google/google-api-java-client/issues/543
        com.google.api.client.util.Data.nullOf(Examples.class);
      }

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.util.List<Senses> senses;

      static {
        // hack to force ProGuard to consider Senses used, since otherwise it would be stripped out
        // see https://github.com/google/google-api-java-client/issues/543
        com.google.api.client.util.Data.nullOf(Senses.class);
      }

      /**
       * The words with different meanings but not related words, e.g. "go" (game) and "go" (verb).
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private Source source;

      /**
       * @return value or {@code null} for none
       */
      public java.util.List<Derivatives> getDerivatives() {
        return derivatives;
      }

      /**
       * @param derivatives derivatives or {@code null} for none
       */
      public Words setDerivatives(java.util.List<Derivatives> derivatives) {
        this.derivatives = derivatives;
        return this;
      }

      /**
       * @return value or {@code null} for none
       */
      public java.util.List<Examples> getExamples() {
        return examples;
      }

      /**
       * @param examples examples or {@code null} for none
       */
      public Words setExamples(java.util.List<Examples> examples) {
        this.examples = examples;
        return this;
      }

      /**
       * @return value or {@code null} for none
       */
      public java.util.List<Senses> getSenses() {
        return senses;
      }

      /**
       * @param senses senses or {@code null} for none
       */
      public Words setSenses(java.util.List<Senses> senses) {
        this.senses = senses;
        return this;
      }

      /**
       * The words with different meanings but not related words, e.g. "go" (game) and "go" (verb).
       * @return value or {@code null} for none
       */
      public Source getSource() {
        return source;
      }

      /**
       * The words with different meanings but not related words, e.g. "go" (game) and "go" (verb).
       * @param source source or {@code null} for none
       */
      public Words setSource(Source source) {
        this.source = source;
        return this;
      }

      @Override
      public Words set(String fieldName, Object value) {
        return (Words) super.set(fieldName, value);
      }

      @Override
      public Words clone() {
        return (Words) super.clone();
      }

      /**
       * Model definition for DictlayerdataDictWordsDerivatives.
       */
      public static final class Derivatives extends com.google.api.client.json.GenericJson {

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private Source source;

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.String text;

        /**
         * @return value or {@code null} for none
         */
        public Source getSource() {
          return source;
        }

        /**
         * @param source source or {@code null} for none
         */
        public Derivatives setSource(Source source) {
          this.source = source;
          return this;
        }

        /**
         * @return value or {@code null} for none
         */
        public java.lang.String getText() {
          return text;
        }

        /**
         * @param text text or {@code null} for none
         */
        public Derivatives setText(java.lang.String text) {
          this.text = text;
          return this;
        }

        @Override
        public Derivatives set(String fieldName, Object value) {
          return (Derivatives) super.set(fieldName, value);
        }

        @Override
        public Derivatives clone() {
          return (Derivatives) super.clone();
        }

        /**
         * Model definition for DictlayerdataDictWordsDerivativesSource.
         */
        public static final class Source extends com.google.api.client.json.GenericJson {

          /**
           * The value may be {@code null}.
           */
          @com.google.api.client.util.Key
          private java.lang.String attribution;

          /**
           * The value may be {@code null}.
           */
          @com.google.api.client.util.Key
          private java.lang.String url;

          /**
           * @return value or {@code null} for none
           */
          public java.lang.String getAttribution() {
            return attribution;
          }

          /**
           * @param attribution attribution or {@code null} for none
           */
          public Source setAttribution(java.lang.String attribution) {
            this.attribution = attribution;
            return this;
          }

          /**
           * @return value or {@code null} for none
           */
          public java.lang.String getUrl() {
            return url;
          }

          /**
           * @param url url or {@code null} for none
           */
          public Source setUrl(java.lang.String url) {
            this.url = url;
            return this;
          }

          @Override
          public Source set(String fieldName, Object value) {
            return (Source) super.set(fieldName, value);
          }

          @Override
          public Source clone() {
            return (Source) super.clone();
          }

        }
      }
      /**
       * Model definition for DictlayerdataDictWordsExamples.
       */
      public static final class Examples extends com.google.api.client.json.GenericJson {

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private Source source;

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.String text;

        /**
         * @return value or {@code null} for none
         */
        public Source getSource() {
          return source;
        }

        /**
         * @param source source or {@code null} for none
         */
        public Examples setSource(Source source) {
          this.source = source;
          return this;
        }

        /**
         * @return value or {@code null} for none
         */
        public java.lang.String getText() {
          return text;
        }

        /**
         * @param text text or {@code null} for none
         */
        public Examples setText(java.lang.String text) {
          this.text = text;
          return this;
        }

        @Override
        public Examples set(String fieldName, Object value) {
          return (Examples) super.set(fieldName, value);
        }

        @Override
        public Examples clone() {
          return (Examples) super.clone();
        }

        /**
         * Model definition for DictlayerdataDictWordsExamplesSource.
         */
        public static final class Source extends com.google.api.client.json.GenericJson {

          /**
           * The value may be {@code null}.
           */
          @com.google.api.client.util.Key
          private java.lang.String attribution;

          /**
           * The value may be {@code null}.
           */
          @com.google.api.client.util.Key
          private java.lang.String url;

          /**
           * @return value or {@code null} for none
           */
          public java.lang.String getAttribution() {
            return attribution;
          }

          /**
           * @param attribution attribution or {@code null} for none
           */
          public Source setAttribution(java.lang.String attribution) {
            this.attribution = attribution;
            return this;
          }

          /**
           * @return value or {@code null} for none
           */
          public java.lang.String getUrl() {
            return url;
          }

          /**
           * @param url url or {@code null} for none
           */
          public Source setUrl(java.lang.String url) {
            this.url = url;
            return this;
          }

          @Override
          public Source set(String fieldName, Object value) {
            return (Source) super.set(fieldName, value);
          }

          @Override
          public Source clone() {
            return (Source) super.clone();
          }

        }
      }
      /**
       * Model definition for DictlayerdataDictWordsSenses.
       */
      public static final class Senses extends com.google.api.client.json.GenericJson {

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.util.List<Conjugations> conjugations;

        static {
          // hack to force ProGuard to consider Conjugations used, since otherwise it would be stripped out
          // see https://github.com/google/google-api-java-client/issues/543
          com.google.api.client.util.Data.nullOf(Conjugations.class);
        }

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.util.List<Definitions> definitions;

        static {
          // hack to force ProGuard to consider Definitions used, since otherwise it would be stripped out
          // see https://github.com/google/google-api-java-client/issues/543
          com.google.api.client.util.Data.nullOf(Definitions.class);
        }

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.String partOfSpeech;

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.String pronunciation;

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.String pronunciationUrl;

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private Source source;

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.String syllabification;

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.util.List<Synonyms> synonyms;

        static {
          // hack to force ProGuard to consider Synonyms used, since otherwise it would be stripped out
          // see https://github.com/google/google-api-java-client/issues/543
          com.google.api.client.util.Data.nullOf(Synonyms.class);
        }

        /**
         * @return value or {@code null} for none
         */
        public java.util.List<Conjugations> getConjugations() {
          return conjugations;
        }

        /**
         * @param conjugations conjugations or {@code null} for none
         */
        public Senses setConjugations(java.util.List<Conjugations> conjugations) {
          this.conjugations = conjugations;
          return this;
        }

        /**
         * @return value or {@code null} for none
         */
        public java.util.List<Definitions> getDefinitions() {
          return definitions;
        }

        /**
         * @param definitions definitions or {@code null} for none
         */
        public Senses setDefinitions(java.util.List<Definitions> definitions) {
          this.definitions = definitions;
          return this;
        }

        /**
         * @return value or {@code null} for none
         */
        public java.lang.String getPartOfSpeech() {
          return partOfSpeech;
        }

        /**
         * @param partOfSpeech partOfSpeech or {@code null} for none
         */
        public Senses setPartOfSpeech(java.lang.String partOfSpeech) {
          this.partOfSpeech = partOfSpeech;
          return this;
        }

        /**
         * @return value or {@code null} for none
         */
        public java.lang.String getPronunciation() {
          return pronunciation;
        }

        /**
         * @param pronunciation pronunciation or {@code null} for none
         */
        public Senses setPronunciation(java.lang.String pronunciation) {
          this.pronunciation = pronunciation;
          return this;
        }

        /**
         * @return value or {@code null} for none
         */
        public java.lang.String getPronunciationUrl() {
          return pronunciationUrl;
        }

        /**
         * @param pronunciationUrl pronunciationUrl or {@code null} for none
         */
        public Senses setPronunciationUrl(java.lang.String pronunciationUrl) {
          this.pronunciationUrl = pronunciationUrl;
          return this;
        }

        /**
         * @return value or {@code null} for none
         */
        public Source getSource() {
          return source;
        }

        /**
         * @param source source or {@code null} for none
         */
        public Senses setSource(Source source) {
          this.source = source;
          return this;
        }

        /**
         * @return value or {@code null} for none
         */
        public java.lang.String getSyllabification() {
          return syllabification;
        }

        /**
         * @param syllabification syllabification or {@code null} for none
         */
        public Senses setSyllabification(java.lang.String syllabification) {
          this.syllabification = syllabification;
          return this;
        }

        /**
         * @return value or {@code null} for none
         */
        public java.util.List<Synonyms> getSynonyms() {
          return synonyms;
        }

        /**
         * @param synonyms synonyms or {@code null} for none
         */
        public Senses setSynonyms(java.util.List<Synonyms> synonyms) {
          this.synonyms = synonyms;
          return this;
        }

        @Override
        public Senses set(String fieldName, Object value) {
          return (Senses) super.set(fieldName, value);
        }

        @Override
        public Senses clone() {
          return (Senses) super.clone();
        }

        /**
         * Model definition for DictlayerdataDictWordsSensesConjugations.
         */
        public static final class Conjugations extends com.google.api.client.json.GenericJson {

          /**
           * The value may be {@code null}.
           */
          @com.google.api.client.util.Key
          private java.lang.String type;

          /**
           * The value may be {@code null}.
           */
          @com.google.api.client.util.Key
          private java.lang.String value;

          /**
           * @return value or {@code null} for none
           */
          public java.lang.String getType() {
            return type;
          }

          /**
           * @param type type or {@code null} for none
           */
          public Conjugations setType(java.lang.String type) {
            this.type = type;
            return this;
          }

          /**
           * @return value or {@code null} for none
           */
          public java.lang.String getValue() {
            return value;
          }

          /**
           * @param value value or {@code null} for none
           */
          public Conjugations setValue(java.lang.String value) {
            this.value = value;
            return this;
          }

          @Override
          public Conjugations set(String fieldName, Object value) {
            return (Conjugations) super.set(fieldName, value);
          }

          @Override
          public Conjugations clone() {
            return (Conjugations) super.clone();
          }

        }
        /**
         * Model definition for DictlayerdataDictWordsSensesDefinitions.
         */
        public static final class Definitions extends com.google.api.client.json.GenericJson {

          /**
           * The value may be {@code null}.
           */
          @com.google.api.client.util.Key
          private java.lang.String definition;

          /**
           * The value may be {@code null}.
           */
          @com.google.api.client.util.Key
          private java.util.List<Examples> examples;

          static {
            // hack to force ProGuard to consider Examples used, since otherwise it would be stripped out
            // see https://github.com/google/google-api-java-client/issues/543
            com.google.api.client.util.Data.nullOf(Examples.class);
          }

          /**
           * @return value or {@code null} for none
           */
          public java.lang.String getDefinition() {
            return definition;
          }

          /**
           * @param definition definition or {@code null} for none
           */
          public Definitions setDefinition(java.lang.String definition) {
            this.definition = definition;
            return this;
          }

          /**
           * @return value or {@code null} for none
           */
          public java.util.List<Examples> getExamples() {
            return examples;
          }

          /**
           * @param examples examples or {@code null} for none
           */
          public Definitions setExamples(java.util.List<Examples> examples) {
            this.examples = examples;
            return this;
          }

          @Override
          public Definitions set(String fieldName, Object value) {
            return (Definitions) super.set(fieldName, value);
          }

          @Override
          public Definitions clone() {
            return (Definitions) super.clone();
          }

          /**
           * Model definition for DictlayerdataDictWordsSensesDefinitionsExamples.
           */
          public static final class Examples extends com.google.api.client.json.GenericJson {

            /**
             * The value may be {@code null}.
             */
            @com.google.api.client.util.Key
            private Source source;

            /**
             * The value may be {@code null}.
             */
            @com.google.api.client.util.Key
            private java.lang.String text;

            /**
             * @return value or {@code null} for none
             */
            public Source getSource() {
              return source;
            }

            /**
             * @param source source or {@code null} for none
             */
            public Examples setSource(Source source) {
              this.source = source;
              return this;
            }

            /**
             * @return value or {@code null} for none
             */
            public java.lang.String getText() {
              return text;
            }

            /**
             * @param text text or {@code null} for none
             */
            public Examples setText(java.lang.String text) {
              this.text = text;
              return this;
            }

            @Override
            public Examples set(String fieldName, Object value) {
              return (Examples) super.set(fieldName, value);
            }

            @Override
            public Examples clone() {
              return (Examples) super.clone();
            }

            /**
             * Model definition for DictlayerdataDictWordsSensesDefinitionsExamplesSource.
             */
            public static final class Source extends com.google.api.client.json.GenericJson {

              /**
               * The value may be {@code null}.
               */
              @com.google.api.client.util.Key
              private java.lang.String attribution;

              /**
               * The value may be {@code null}.
               */
              @com.google.api.client.util.Key
              private java.lang.String url;

              /**
               * @return value or {@code null} for none
               */
              public java.lang.String getAttribution() {
                return attribution;
              }

              /**
               * @param attribution attribution or {@code null} for none
               */
              public Source setAttribution(java.lang.String attribution) {
                this.attribution = attribution;
                return this;
              }

              /**
               * @return value or {@code null} for none
               */
              public java.lang.String getUrl() {
                return url;
              }

              /**
               * @param url url or {@code null} for none
               */
              public Source setUrl(java.lang.String url) {
                this.url = url;
                return this;
              }

              @Override
              public Source set(String fieldName, Object value) {
                return (Source) super.set(fieldName, value);
              }

              @Override
              public Source clone() {
                return (Source) super.clone();
              }

            }
          }
        }
        /**
         * Model definition for DictlayerdataDictWordsSensesSource.
         */
        public static final class Source extends com.google.api.client.json.GenericJson {

          /**
           * The value may be {@code null}.
           */
          @com.google.api.client.util.Key
          private java.lang.String attribution;

          /**
           * The value may be {@code null}.
           */
          @com.google.api.client.util.Key
          private java.lang.String url;

          /**
           * @return value or {@code null} for none
           */
          public java.lang.String getAttribution() {
            return attribution;
          }

          /**
           * @param attribution attribution or {@code null} for none
           */
          public Source setAttribution(java.lang.String attribution) {
            this.attribution = attribution;
            return this;
          }

          /**
           * @return value or {@code null} for none
           */
          public java.lang.String getUrl() {
            return url;
          }

          /**
           * @param url url or {@code null} for none
           */
          public Source setUrl(java.lang.String url) {
            this.url = url;
            return this;
          }

          @Override
          public Source set(String fieldName, Object value) {
            return (Source) super.set(fieldName, value);
          }

          @Override
          public Source clone() {
            return (Source) super.clone();
          }

        }
        /**
         * Model definition for DictlayerdataDictWordsSensesSynonyms.
         */
        public static final class Synonyms extends com.google.api.client.json.GenericJson {

          /**
           * The value may be {@code null}.
           */
          @com.google.api.client.util.Key
          private Source source;

          /**
           * The value may be {@code null}.
           */
          @com.google.api.client.util.Key
          private java.lang.String text;

          /**
           * @return value or {@code null} for none
           */
          public Source getSource() {
            return source;
          }

          /**
           * @param source source or {@code null} for none
           */
          public Synonyms setSource(Source source) {
            this.source = source;
            return this;
          }

          /**
           * @return value or {@code null} for none
           */
          public java.lang.String getText() {
            return text;
          }

          /**
           * @param text text or {@code null} for none
           */
          public Synonyms setText(java.lang.String text) {
            this.text = text;
            return this;
          }

          @Override
          public Synonyms set(String fieldName, Object value) {
            return (Synonyms) super.set(fieldName, value);
          }

          @Override
          public Synonyms clone() {
            return (Synonyms) super.clone();
          }

          /**
           * Model definition for DictlayerdataDictWordsSensesSynonymsSource.
           */
          public static final class Source extends com.google.api.client.json.GenericJson {

            /**
             * The value may be {@code null}.
             */
            @com.google.api.client.util.Key
            private java.lang.String attribution;

            /**
             * The value may be {@code null}.
             */
            @com.google.api.client.util.Key
            private java.lang.String url;

            /**
             * @return value or {@code null} for none
             */
            public java.lang.String getAttribution() {
              return attribution;
            }

            /**
             * @param attribution attribution or {@code null} for none
             */
            public Source setAttribution(java.lang.String attribution) {
              this.attribution = attribution;
              return this;
            }

            /**
             * @return value or {@code null} for none
             */
            public java.lang.String getUrl() {
              return url;
            }

            /**
             * @param url url or {@code null} for none
             */
            public Source setUrl(java.lang.String url) {
              this.url = url;
              return this;
            }

            @Override
            public Source set(String fieldName, Object value) {
              return (Source) super.set(fieldName, value);
            }

            @Override
            public Source clone() {
              return (Source) super.clone();
            }

          }
        }
      }
      /**
       * The words with different meanings but not related words, e.g. "go" (game) and "go" (verb).
       */
      public static final class Source extends com.google.api.client.json.GenericJson {

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.String attribution;

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.String url;

        /**
         * @return value or {@code null} for none
         */
        public java.lang.String getAttribution() {
          return attribution;
        }

        /**
         * @param attribution attribution or {@code null} for none
         */
        public Source setAttribution(java.lang.String attribution) {
          this.attribution = attribution;
          return this;
        }

        /**
         * @return value or {@code null} for none
         */
        public java.lang.String getUrl() {
          return url;
        }

        /**
         * @param url url or {@code null} for none
         */
        public Source setUrl(java.lang.String url) {
          this.url = url;
          return this;
        }

        @Override
        public Source set(String fieldName, Object value) {
          return (Source) super.set(fieldName, value);
        }

        @Override
        public Source clone() {
          return (Source) super.clone();
        }

      }
    }
  }

}