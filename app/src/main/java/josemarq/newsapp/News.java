
package josemarq.newsapp;

/**
 * An {@link News} object contains information related to a single article.
 */
public class News {

    private String mTitulo;
    private String mSeccion;
    private String mFecha;
    private String mUrl;

    /**
     * Constructs a new {@link News} object.
     *
     * @param titulo  is the title of article
     * @param seccion is the section of the article
     * @param fecha   is the date or the article
     * @param url     is the website URL to fthe article
     */
    public News(String titulo, String seccion, String fecha, String url) {
        mTitulo = titulo;
        mSeccion = seccion;
        mFecha = fecha;
        mUrl = url;
    }

    /**
     * Returns the items
     */
    public String getTitulo() { return mTitulo; }

    public String getSeccion() { return mSeccion; }

    public String getFecha() {
        return mFecha;
    }

    public String getUrl() {
        return mUrl;
    }
}